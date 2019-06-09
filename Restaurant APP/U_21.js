
function operation(){
    var name = document.getElementById('name').value;
    var pass = document.getElementById('pass').value;
    if (name === "" || pass === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_21.php";        
        return true;
    }
}