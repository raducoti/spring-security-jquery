$(document).ready(function() {
  $('#login').click(function() {
    var email = $('#email').val();
    var password = $('#password').val();

    // Checking for blank fields.
    if (email == '' || password == '') {
      $('input[type="text"],input[type="password"]').css(
        'border',
        '2px solid red'
      );
      $('input[type="text"],input[type="password"]').css(
        'box-shadow',
        '0 0 3px red'
      );
    } else {
      var headers = {
        authorization: 'Basic ' + btoa(email + ':' + password)
      };
      $.ajax({
        url: 'http://localhost:9000/login',
        method: 'GET',
        headers: headers,
        success: function(data, textStatus, xhr) {
          console.log('login successful ' + xhr.status);
          var token = xhr.getResponseHeader('x-auth-token');
          console.log('x-auth-token ' + token);
          localStorage.setItem('x-auth-token', token);
          window.location.href = '/home.html';
        },
        error: function(xhr, textStatus, error) {
          console.log('login failed ' + xhr.status);
          $('#loginError').text('Login failed ' + xhr.status);
        }
      });
    }
  });
});
