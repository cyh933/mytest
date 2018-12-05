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
	// script적을 때 <% 적어준다.
	// springcontainer를 사용하기 위해서 생성해줌 (Today.xml) => 객체가 생성되는 순간
	ApplicationContext ctx = new GenericXmlApplicationContext("exam/Today.xml");
	// A(TodayBean.java) 와 springcontainer를 연결하기 위해서 getBean를 써줌. => B를 load 시킴.
	TodayBean tb = ctx.getBean("today", TodayBean.class);
	// 즉, A에서 B를 호출할 수 있음.
%>
	<%=tb.printToday()%>
</body>
</html>