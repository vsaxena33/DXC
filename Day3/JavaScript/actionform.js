function actionform()
{
    username = document.getElementById("userName").value;
    password = document.getElementById("password").value;
    var div1 = document.getElementById("div1");
    var div2 = document.getElementById("div2");
    if(username == 0)
    {
        div1.innerHTML = "<font color = red>username is mandatory</font>"
        return false;
    }
    else
    {
        div1.innerHTML = "";
    }
    if(password == 0)
    {
        div2.innerHTML = "<font color = green>Password is mandatory</font>"
        return false;
    }
    else if(password.length < 6 || password.length > 12)
    {
        div2.innerHTML = "<font color = green>Password should have 6-12 character</font>"
        return false;
    }
    else if(password.charAt(0) != "A")
    {
        div2.innerHTML = "<font color = green>Password should start from A</font>"
        return false;
    }
    else
    {
        div2.innerHTML = "";
    }
}
            