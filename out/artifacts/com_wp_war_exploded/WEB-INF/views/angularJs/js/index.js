var app=angular.module("app",[]);
app.controller("controller",function($scope){
   $scope.init=function(){
       alert("init");
   };
});
