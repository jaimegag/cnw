angular.module('fortunes', ['ngRoute']).config(function ($routeProvider) {

    $routeProvider.when('/', {
        templateUrl: 'fortune.html',
        controller: 'fortune'
    });
    $routeProvider.when('/special', {
        templateUrl: 'special.html',
        controller: 'special'
    });

}).controller('fortune', function ($scope, $http) {

    $http.get('random').success(function (data) {
        $scope.fortune = data;
    });

}).controller('special', function ($scope, $http) {
    
    $http.get('special/special').success(function (data) {
        $scope.special = data;
    });
});