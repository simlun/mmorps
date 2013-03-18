var MMORPSController = function($scope, $http) {
    $scope.players = 3;

    $scope.createGame = function() {
        $http({method: 'POST', url: '/game', data: {'players': $scope.players}}).
            success(function(data, status, headers, config) {
                alert('Successfully created game!\n' + data);
            }).
            error(function(data, status, headers, config) {
                alert('Failed to create game');
            });
    };
};

