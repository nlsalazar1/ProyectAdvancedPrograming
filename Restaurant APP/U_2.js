
function operation(){
    var name = document.getElementById('name').value;
    var pass = document.getElementById('pass').value;
    var type = document.getElementById('type').value;
    if (name === "" || pass === "" || type === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_2.php";        
        return true;
    }
}