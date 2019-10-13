$(function(){
	//solving the active menu problem
	switch(menu)
	{
	case'About us':
	$('#about').addClass('active');
	break;
	
	case'Contact us':
		$('#contact').addClass('active');
		break;
		
	case'All User':
		$('#listUser').addClass('active');
		break;
		
	case'Manage Users':
		$('#manageUsers').addClass('active');
		break;
		
	default:
		if(menu == "Home")break;
	$('#listUsers').addClass('active');
	$('#a_'+menu).addClass('active');
		break;
		
	}
});