<%@ page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- c:forTokens�� java.util.StringTokenizer �� �� -->

1. ȫ�浿#�̼���#������#�������#������� ���ڿ��� #�� �����ڷ� ����<br/>
		<c:forTokens	var="i" 
							items="ȫ�浿#�̼���#������#�������#�����"
							delims="# ">
			�̸�1 : ${ i } <br/>
			�̸�2 : <c:out value="${ i }" /><br/><br/>
		</c:forTokens>

	<br/><hr/>
	
2. ȫ�浿#�̼���#������#�������#������� ���ڿ��� #�� �����ڷ� ����<br/>
	&nbsp&nbsp c:set�� �̿��Ͽ����� <br/>
		<c:set var="names" value="ȫ�浿#�̼���#������#�������#�����" />        
		<c:forTokens	var="i" items="${names}"	delims="# ">
			�̸� : ${ i } <br/>
		</c:forTokens>