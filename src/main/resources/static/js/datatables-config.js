$(document).ready(function() {
    $('#myTable').DataTable({
        processing: true,
        ajax: {
            url: '/spring-demo-th/users',
            dataSrc: 'users'
        },
        columns: [
            {data: 'firstName'},
            {data: 'lastName'},
            {data: 'age'}
        ],
        language: {
            decimal: ',',
            thousands: '.',
            lengthMenu: 'Display _MENU_ records per page',
            zeroRecords: 'Nothing found - sorry',
            info: 'Showing page _PAGE_ of _PAGES_',
            infoEmpty: 'No records available',
            infoFiltered: '(filtered from _MAX_ total records)'
        }
    });
    $('#myButton').on('click', function() {
        console.log('myButton clicked');
    });
});

