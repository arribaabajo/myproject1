function 로그인() {
	id2 = 'root';
	id = prompt('아이디 입력')
	if (id == id2) {
		alert('로그인 성공')
	}else{
		alert('로그인 실패')
	}
}

function 비교(){
	n1 = prompt('숫자1입력')
	n2 = prompt('숫자2입력')
	
	if(n1==n2){
		alert('일치')
	}else{
		alert('불일치')
	}
}