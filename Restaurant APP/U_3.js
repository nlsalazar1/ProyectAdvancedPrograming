
function operation(){
    var id = document.getElementById('id').value;
    var name = document.getElementById('name').value;
    var cost = document.getElementById('cost').value;
    if (id === "" || name === "" || cost === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_3.php";        
        return true;
    }
}