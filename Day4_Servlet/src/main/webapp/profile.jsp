<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Profile</title>

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    body{
        min-height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
        background:linear-gradient(135deg,#667eea,#764ba2);
    }

    .profile-card{
        width:450px;
        background:#fff;
        padding:30px;
        border-radius:20px;
        box-shadow:0 15px 35px rgba(0,0,0,0.2);
        transition:0.4s ease;
    }

    .profile-card:hover{
        transform:translateY(-8px);
        box-shadow:0 20px 40px rgba(0,0,0,0.3);
    }

    .profile-title{
        text-align:center;
        color:#4a4a4a;
        margin-bottom:25px;
        font-size:32px;
    }

    .profile-info{
        display:flex;
        flex-direction:column;
        gap:15px;
    }

    .info-box{
        padding:15px;
        border-left:5px solid #667eea;
        background:#f5f7ff;
        border-radius:10px;
        transition:0.3s;
    }

    .info-box:hover{
        background:#667eea;
        color:white;
        transform:scale(1.03);
        cursor:pointer;
    }

    .label{
        font-weight:bold;
        font-size:16px;
    }

    .value{
        margin-left:8px;
    }

    @media(max-width:500px){
        .profile-card{
            width:90%;
        }
    }
</style>

</head>
<body>

    <div class="profile-card">

        <h1 class="profile-title">Customer Profile</h1>

        <div class="profile-info">

            <div class="info-box">
                <span class="label">Customer Name:</span>
                <span class="value">${c_Name}</span>
            </div>

            <div class="info-box">
                <span class="label">Customer Email:</span>
                <span class="value">${email}</span>
            </div>

            <div class="info-box">
                <span class="label">Mobile Number:</span>
                <span class="value">${mobNo}</span>
            </div>

            <div class="info-box">
                <span class="label">City:</span>
                <span class="value">${city}</span>
            </div>

        </div>

    </div>

</body>
</html>