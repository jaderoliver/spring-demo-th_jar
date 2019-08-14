/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("#myInput").on("keyup", function () {
        var value = $(this).val().toLowerCase();
        $("#myTable tbody tr").filter(function () {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1);
        });
    });
    $("#myButton").on("click", function () {
        $.get("/spring-demo-th/users", function (data) {
            $("#myTable tbody tr").remove();
            function setCol(value) {
                $("#myTable tbody").append("<tr><td>" + value.firstName + "</td><td>" + value.lastName + "</td><td>" + value.age + "</td></tr>");
            }
            data.users.forEach(setCol);
        });
    });
});
