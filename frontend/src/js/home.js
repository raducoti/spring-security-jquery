$(document).ready(function() {
  var token = localStorage.getItem('x-auth-token');
  var headers = {
    'x-auth-token': token
  };
  $.ajax({
    url: 'http://localhost:9000/userInfo',
    method: 'GET',
    headers: headers,
    success: function(data, textStatus, xhr) {
      console.log('username: ' + data.username);
      $('#username').text(data.username);
    },
    error: function(xhr, textStatus, error) {
      console.log('failed to retrieve username ' + xhr.status);
      $('#usernameError').text('Failed to retrieve username ' + xhr.status);
    }
  });

  $.ajax({
    url: 'http://localhost:9000/content',
    method: 'GET',
    headers: headers,
    success: function(data, textStatus, xhr) {
      console.log('messageId: ' + data.id);
      $('#messageId').text(data.id);
      $('#messageContent').text(data.content);
    },
    error: function(xhr, textStatus, error) {
      console.log('failed to retrieve content ' + xhr.status);
      $('#contentError').text('Failed to retrieve content ' + xhr.status);
    }
  });
});
