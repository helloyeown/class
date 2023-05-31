<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-22
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    .check_not {
      color: red;
    }

    .check_ok {
      color: blue;
    }

    #idchk {
      display: none;
    }

  </style>

  <script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=" crossorigin="anonymous"></script>

  <script>

    $(document).ready(function (){

      $('#regForm').submit(function () {

        if (!$('#idchk').prop('checked')){
          alert('아이디 중복 체크는 필수입니다.')
          // $('#uid').focus()

          return false;
        }

      })

      $('#uid').focusout(function () {

        // 공백 체크
        if($(this).val().trim().length<1) {
          $('#chkMsg').text('아이디는 필수 항목입니다.').addClass('check_not')
          return false;
        }

        // 비동기 통신
        $.ajax({
          url: 'idcheck',   // /member/idcheck
          data: { uid: $(this).val() },
          success: function (data) {
            // alert(data) // Y | N

            if(data=='Y') {
              $('#chkMsg').text('사용 가능한 아이디입니다.').addClass('check_ok').removeClass('check_not')
              $('#idchk').prop('checked', true)
            } else {
              $('#chkMsg').text('사용 불가한 아이디입니다.').addClass('check_not').removeClass('check_ok')
              $('#idchk').prop('checked', false)
            }

          }
        })

      })

      $('#uid').focusin(function (){

        // 입력 폼 초기화
        $(this).val('')
        // checkbox => checked => false
        $('#idchk').prop('checked', false)
        // 메시지 초기화
        $('#chkMsg').text('').removeClass('check_not').removeClass('check_ok')

      })
    })

  </script>
</head>
<body>

<h1>회원 가입</h1>
<hr>

<form id="regForm" method="post" enctype="multipart/form-data">
  <table border="1">
    <tr>
      <td>아이디</td>
      <td>
        <input type="text" name="uid" id="uid" required>
        <span id="chkMsg"></span>
        <input type="checkbox" id="idchk">
      </td>
    </tr>
    <tr>
      <td>비밀번호</td>
      <td><input type="password" name="pw" required></td>
    </tr>
    <tr>
      <td>이름</td>
      <td><input type="text" name="uname" required></td>
    </tr>
    <tr>
      <td>사진</td>
      <td><input type="file" name="uphoto"></td>
    </tr>
    <tr>
      <td></td>
      <td>
        <input type="reset">
        <input type="submit">
      </td>
    </tr>
  </table>
</form>

</body>
</html>
