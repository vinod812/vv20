var app = angular.module('myApp', []);

app.controller('UserController', function($scope, $http) {
    $scope.users = [];
    $scope.newUser = {};

    // Fetch all users
    $http.get('/users').then(function(response) {
        $scope.users = response.data;
    });

    // Add a new user
    $scope.addUser = function() {
        $http.post('/users', $scope.newUser).then(function(response) {
            $scope.users.push(response.data);
            $scope.newUser = {};  // Clear the form
        });
    };
});
