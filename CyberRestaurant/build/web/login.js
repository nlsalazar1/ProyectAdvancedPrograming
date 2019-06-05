/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validateText(text){
	var standard = /^[a-zA-Z]*$/;
    if (text.search(standard)){
		return false;
	}
	else{
		return true;
	}
}

function validate(){
    var name;

    name = document.getElementById("name").value;
    
	if(validateText(name) === false){
		alert("NAME DOESNT HAVE NUMBERS");
		return false;
	}
	else{
		document.getElementById('form').action = "./login.php";
		return true;
	}
}
