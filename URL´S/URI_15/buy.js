
function buy(){
    var nameSaucer = document.getElementById('nameSaucer').value;
    var qualification = document.getElementById('qualification').value;
    if (nameSaucer === "" || qualification === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./buy.php";        
        return true;
    }
}