<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> <!-- jsp ������. �����ϰ� ���õ� ���� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP���� #1 ����</title>
</head>
<body> <!-- �ڵ� ���� �Ŀ��� ������ ���ΰ�ħ. ���� -->
<% /* ��ũ��Ʈ�� : jsp �������� �ȿ� �ڹ��ڵ� �ۼ� ���� */
	String msg = "jsp start test";
	Calendar now = Calendar.getInstance();
%>
message : <h3>���� �޽����� <%= msg %></h3> <!-- ǥ���� : ���� ��, ���� ��� �� ��� -->
���� �ð� : <h3><%= now.getTime() %></h3>
<hr>
<!-- �ڹ��ڵ� table�� �Ẹ�� -->
<table style="width: 70%">
	<tr><td>��ȣ</td><td>�̸�</td></tr>
<%
	String[] name = {"ȫ�浿", "������", "����", "�ڼ���", "����"};
	for (int i = 0; i < 5; i++) {
%>
	<tr>
		<td><%= i+1 %></td> <!-- ��ȣ �� -->
		<td><% if (name[i].equals("�ڼ���")) {
			out.print("<b style='color: blue'>");
			out.print(name[i]);
			out.print("</b>");
			} else {
			%>
			<%= name[i] %>
			<%
			}
			%>
		</td> <!-- �̸� -->
	</tr>
<%
	}
%>
</body>
</html>