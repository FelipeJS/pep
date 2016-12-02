angular.module('starter.controllers', [])

.controller('AppCtrl', function($scope, $ionicModal, $timeout) {

  // With the new view caching in Ionic, Controllers are only called
  // when they are recreated or on app start, instead of every page change.
  // To listen for when this page is active (for example, to refresh data),
  // listen for the $ionicView.enter event:
  //$scope.$on('$ionicView.enter', function(e) {
  //});

  // Form data for the login modal
  $scope.loginData = {};

  // Create the login modal that we will use later
  $ionicModal.fromTemplateUrl('templates/login.html', {
    scope: $scope
  }).then(function(modal) {
    $scope.modal = modal;
  });

  // Triggered in the login modal to close it
  $scope.closeLogin = function() {
    $scope.modal.hide();
  };

  // Open the login modal
  $scope.login = function() {
    $scope.modal.show();
  };

  // Perform the login action when the user submits the login form
  $scope.doLogin = function() {
    console.log('Doing login', $scope.loginData);

    // Simulate a login delay. Remove this and replace with your login
    // code if using a login system
    $timeout(function() {
      $scope.closeLogin();
    }, 1000);
  };
})

.controller('ProdutividadeCtrl', function($scope, $http, $filter) {
	
	$scope.pesquisar = 'Pesquisar';
	$scope.produtividades = [];
	
	$scope.sortType     = 'prestador'; // set the default sort type
	$scope.sortReverse  = false;  // set the default sort order
	$scope.searchFish   = '';     // set the default search/filter term
	
	$scope.$watchCollection('produtividades',function() {
		$scope.totalPctUrg = 0;  
		$scope.totalPctAtEncam = 0;
		$scope.totalPareceresSol = 0;  
		$scope.totalPareceresRea = 0;  
		$scope.totalCirurgias = 0;  
		$scope.totalPrescricoes = 0;  
		$scope.totalEvolucoes = 0;  
		$scope.totalAuxiliar = 0;  
		$scope.totalAtendAmb = 0;  
		
		angular.forEach($scope.produtividades, function(value, key) {
			$scope.totalPctUrg += value.pctUrg;
			$scope.totalPctAtEncam += value.pctAtEncam;
			$scope.totalPareceresSol += value.pareceresSol;
			$scope.totalPareceresRea += value.pareceresRea;
			$scope.totalCirurgias += value.cirurgias;
			$scope.totalPrescricoes += value.prescricoes;
			$scope.totalEvolucoes += value.evolucoes;
			$scope.totalAuxiliar += value.auxiliar;
			$scope.totalAtendAmb += value.atendAmb;
		});
	});
	
	function copiarLista(){
		$scope.produtividadesCopia = $scope.produtividades;
	}
	
	$scope.atualizarTotal = function(prestadorFilter,especialidadeFilter,tpVinculoFilter,snAtuanteFilter){
		$scope.produtividades = $filter('filter')($scope.produtividades, {prestador:prestadorFilter, 
			especialidade:especialidadeFilter, tpVinculo:tpVinculoFilter, snAtuante:snAtuanteFilter});
	}; 
	
	$scope.recuperarLista = function(){
		$scope.produtividades = $scope.produtividadesCopia;
	}; 
	
	$scope.getProdutividade = function (mesInicio, mesFim, ano) {
		if(!validacao(mesInicio, ano)){
			$scope.pesquisar = 'Preenchido incorretamente';
		}else{
			desabilitar();
			$http.get("/produtividade/listarPorPeriodo?mesInicio="+ mesInicio + "&mesFim=" + mesFim + "&ano=" + ano, '').success(function (produtividades) {
				abilitar();
				
				$scope.produtividades = produtividades;
				copiarLista();
			});
		}
	};
	
	var validacao = function(mesFF, ano){
		if(mesFF == '%' || mesFF == '%%' || mesFF == '#' || mesFF == '##' || ano == '%' || ano == '%%' || ano == '%%%'
			|| ano == '%%%%' || ano == '#' || ano == '##' || ano == '###' || ano == '####'){
			return false;
		}else{
			return true;
		}
	};
	
	function desabilitar() {
		$scope.desabilitado = true;
		$scope.pesquisar = 'Buscando dados... Aguarde um momento';
	}
	
	function abilitar() {
		$scope.desabilitado = false;
		$scope.pesquisar = 'Pesquisar';
	}
	
})

.controller('PrestadorCtrl', function($scope, $stateParams, $http) {
	$scope.cdPrestador = $stateParams.cdPrestador;
	$scope.mesFF = $stateParams.mesFF;
	$scope.ano = $stateParams.ano;
	$scope.prestador = $stateParams.prestador;
	
	$scope.cdPrestadorFilter = $scope.cdPrestador;
	
	function setSelecionado(selecionado) {
		$scope.selecionado = selecionado;
	}
	
	$scope.getPrescricao = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/prescricao/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (prescricoes) {
			abilitar();
			setSelecionado(selecionado);
			$scope.prescricoes = prescricoes;
			$scope.nmObjetoFilter = 'PRES';
			$scope.sortType     = 'cdPreMed'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getEvolucao = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/prescricao/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (prescricoes) {
			abilitar();
			setSelecionado(selecionado);
			$scope.prescricoes = prescricoes;
			$scope.nmObjetoFilter = 'EVO';
			$scope.sortType     = 'cdPreMed'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getUrgencia = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/atendime/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (atendimentos) {
			abilitar();
			setSelecionado(selecionado);
			$scope.atendimentos = atendimentos;
			$scope.tipoAtendimentoFilter = 'URG';
			$scope.sortType     = 'cdAtendimento'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getAmbulatorio = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/atendime/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (atendimentos) {
			abilitar();
			setSelecionado(selecionado);
			$scope.atendimentos = atendimentos;
			$scope.tipoAtendimentoFilter = 'AMB';
			$scope.sortType     = 'cdAtendimento'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getCirurgia = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/cirurgia/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (cirurgias) {
			abilitar();
			setSelecionado(selecionado);
			$scope.cirurgias = cirurgias;
			$scope.tipoFuncaoFilter = 'Cir';
			$scope.sortType     = 'cdAvisoCirurgia'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getAuxiliar = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/cirurgia/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (cirurgias) {
			abilitar();
			setSelecionado(selecionado);
			$scope.cirurgias = cirurgias;
			$scope.tipoFuncaoFilter = 'Aux';
			$scope.sortType     = 'cdAvisoCirurgia'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getParecerSol = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/parecer/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (pareceres) {
			abilitar();
			setSelecionado(selecionado);
			$scope.pareceres = pareceres;
			$scope.tipoParecerFilter = 'Sol';
			$scope.sortType     = 'cdParMed'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getParecerRes = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/parecer/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (pareceres) {
			abilitar();
			setSelecionado(selecionado);
			$scope.pareceres = pareceres;
			$scope.tipoParecerFilter = 'Res';
			$scope.sortType     = 'cdParMed'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getEncaminha = function (cdPrestador, mesFF, ano, selecionado) {
		desabilitar();
		$http.get("/encaminha/listarPorData?cdPrestador="+ cdPrestador + 
					"&mes=" + mesFF + "&ano=" + ano, '').success(function (encaminhamentos) {
			abilitar();
			setSelecionado(selecionado);
			$scope.encaminhamentos = encaminhamentos;
			$scope.sortType     = 'cdEncaminhamento'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	function desabilitar() {
		$scope.desabilitado = true;
		$scope.pesquisar = 'Buscando dados...';
	}
	
	function abilitar() {
		$scope.desabilitado = false;
	}
	
	$scope.isSelected = function(selected) {
		$scope.selected = selected;
	};
})

.controller('PrescricaoCtrl', function($scope, $stateParams, $http) {
	$scope.cdPreMed = $stateParams.cdPreMed;
	$scope.cdPrestador = $stateParams.cdPrestador;
	$scope.mesFF = $stateParams.mesFF;
	$scope.ano = $stateParams.ano;
	
	$scope.getItPreMed = function () {
		$http.get("/itpremed/listarPorData?cdPreMed="+ $scope.cdPreMed + "&cdPrestador=" + $scope.cdPrestador +
					"&mes=" + $scope.mesFF + "&ano=" + $scope.ano, '').success(function (itens) {
			$scope.itens = itens;
			$scope.sortType     = 'cdItPreMed'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getItPreMed();
})

.controller('EvolucaoCtrl', function($scope, $stateParams, $http) {
	$scope.cdPreMed = $stateParams.cdPreMed;
	$scope.cdPrestador = $stateParams.cdPrestador;
	$scope.mesFF = $stateParams.mesFF;
	$scope.ano = $stateParams.ano;
	
	$scope.getEvolucao = function () {
		$http.get("/prescricao/listarPorData?cdPrestador="+ $scope.cdPrestador + 
					"&mes=" + $scope.mesFF + "&ano=" + $scope.ano, '').success(function (prescricoes) {
			$scope.prescricoes = prescricoes;
			$scope.cdPreMedFilter = $scope.cdPreMed;
			$scope.sortType     = 'cdPreMed'; // set the default sort type
			$scope.sortReverse  = false;  // set the default sort order
			$scope.searchFish   = '';     // set the default search/filter term
		});
	};
	
	$scope.getEvolucao();
	})
	
.controller('DescricaoCtrl', function($scope, $stateParams, $http) {
		$scope.cdAvisoCirurgia = $stateParams.cdAvisoCirurgia;
		$scope.cdPrestador = $stateParams.cdPrestador;
		$scope.mesFF = $stateParams.mesFF;
		$scope.ano = $stateParams.ano;
		
		$scope.getDescricao = function () {
			$http.get("/descricao/consultar?cdAvisoCirurgia="+ $scope.cdAvisoCirurgia, '').success(function (descricao) {
				$scope.descricao = descricao;
				$scope.cdAvisoCirurgiaFilter = $scope.cdAvisoCirurgia;
				$scope.sortType     = 'cdAvisoCirurgia'; // set the default sort type
				$scope.sortReverse  = false;  // set the default sort order
				$scope.searchFish   = '';     // set the default search/filter term
			});
		};
	
	$scope.getDescricao();
});
