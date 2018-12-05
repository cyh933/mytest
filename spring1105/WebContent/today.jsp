<%@page import="exam.TodayBean"%>
<%@page import="java.util.Date"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>today.jsp</title>
</head>
<body>
<%
	// script���� �� <% �����ش�.
	// springcontainer�� ����ϱ� ���ؼ� �������� (Today.xml) => ��ü�� �����Ǵ� ����
	ApplicationContext ctx = new GenericXmlApplicationContext("exam/Today.xml");
	// A(TodayBean.java) �� springcontainer�� �����ϱ� ���ؼ� getBean�� ����. => B�� load ��Ŵ.
	TodayBean tb = ctx.getBean("today", TodayBean.class);
	// ��, A���� B�� ȣ���� �� ����.
%>
	<%=tb.printToday()%>
</body>
</html>