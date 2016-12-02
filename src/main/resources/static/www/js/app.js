// Ionic Starter App

// angular.module is a global place for creating, registering and retrieving Angular modules
// 'starter' is the name of this angular module example (also set in a <body> attribute in index.html)
// the 2nd parameter is an array of 'requires'
// 'starter.controllers' is found in controllers.js
angular.module('starter', ['ionic', 'starter.controllers'])

.run(function($ionicPlatform) {
  $ionicPlatform.ready(function() {
    // Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
    // for form inputs)
    if (window.cordova && window.cordova.plugins.Keyboard) {
      cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);
      cordova.plugins.Keyboard.disableScroll(true);

    }
    if (window.StatusBar) {
      // org.apache.cordova.statusbar required
      StatusBar.styleDefault();
    }
  });
})

.config(function($stateProvider, $urlRouterProvider) {
  $stateProvider

    .state('app', {
    url: '/app',
    abstract: true,
    templateUrl: 'templates/menu.html',
    controller: 'AppCtrl'
  })


	.state('app.produtividade', {
	  url: '/produtividade',
	  views: {
	    'menuContent': {
	      templateUrl: 'templates/produtividade.html',
	      controller: 'ProdutividadeCtrl'
	    }
	  }
	})

  .state('app.prestador', {
    url: '/prestador/:cdPrestador/:mesFF/:ano/:prestador',
    views: {
      'menuContent': {
        templateUrl: 'templates/prestador.html',
        controller: 'PrestadorCtrl'
      }
    }
  })
  
  .state('app.prescricao', {
    url: '/prescricao/:cdPreMed/:cdPrestador/:mesFF/:ano',
    views: {
      'menuContent': {
        templateUrl: 'templates/prescricao.html',
        controller: 'PrescricaoCtrl'
      }
    }
  })
  
   .state('app.evolucao', {
    url: '/evolucao/:cdPreMed/:cdPrestador/:mesFF/:ano',
    views: {
      'menuContent': {
        templateUrl: 'templates/evolucao.html',
        controller: 'EvolucaoCtrl'
      }
    }
  })
  
  .state('app.descricao', {
    url: '/descricao/:cdAvisoCirurgia/:cdPrestador/:mesFF/:ano',
    views: {
      'menuContent': {
        templateUrl: 'templates/descricao.html',
        controller: 'DescricaoCtrl'
      }
    }
  });
  
  // if none of the above states are matched, use this as the fallback
  $urlRouterProvider.otherwise('/app/produtividade');
});
