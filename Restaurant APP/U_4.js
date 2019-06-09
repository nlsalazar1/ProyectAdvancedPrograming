
function operation(){
    var id = document.getElementById('id').value;
    var name = document.getElementById('name').value;
    var lastname = document.getElementById('lastname').value;
    var telephone = document.getElementById('telephone').value;
    var mail = document.getElementById('mail').value;
    if (id === "" || name === "" || lastname === "" || telephone === "" || mail === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_4.php";        
        return true;
    }
}