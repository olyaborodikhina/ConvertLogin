<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Converter</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<td><div align="right">
    <form action="/logout" method="post">
    <h2> <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
    </form>
</div></td>

<table class="header_user_pricebox">
    <colgroup>
        <col class="description_size_1">
        <col class="absolute_change_small">
        <col class="percental_change">

        <col class="description_size_4">
        <col class="absolute_change_small">
        <col class="percental_change">

        <col class="description_size_3">
        <col class="absolute_change_small">
        <col class="percental_change">

        <col class="description_size_2">
        <col class="absolute_change_large">
        <col class="percental_change">
    </colgroup>

    <tbody>
    <tr>
        <th><a href="/valyuty/USD-RUB" title="USD/RUB">USD/RUB</a></th>
        <td><span class="colorGreen"><span class="colorGreen">59,6000</span></span></td>
    </tr>
    <tr>
        <th><a href="/valyuty/EUR-RUB" title="EUR/RUB">EUR/RUB</a></th>
        <td><span class="colorGreen"><span class="colorRed">62,7677</span></span></td>
    </tr>
    <tr class="last">
        <th><a href="/valyuty/EUR-USD" title="EUR/USD">EUR/USD</a></th>
        <td><span class="colorGreen"><span class="colorRed">1,0533</span></span></td>
    </tr>
    </tbody>
</table>


<div class="form_item form_item-sum"><h4>Count:</h4><input id="currency_amount" size="10" value="0" type="text"><select name="converter_currency" id="converter_currency"><option value="USD">USD</option>
    <option value="EUR">EUR</option>
    <option value="USD">USD</option>
    <option value="RUB">RUB</option></select></div>


<div class="form_item form_item-sum"><h4>Count:</h4><input id="currency" size="10" value="0" type="text"><select name="converter_currency" id="converter_currency"><option value="USD">USD</option>
    <option value="EUR">EUR</option>
    <option value="USD">EUR</option>
    <option value="RUB">RUB</option></select></div>
<input type="button" id="submit" disabled="true" value=" Convert ">


<table class="table table-data -important"><thead>
<tr><td class="col-cy">Currency</td>
    <td class="col-buy">Balance</td>
</tr></thead>
    <tbody>
    <tr>
        <th>USD</th><td><span class="value -decrease"><span>27.1958</span></span>
    <tr><th>EUR</th><td><span class="value -increase"><span>28.4815</span>
    <tr><th>RUB</th><td><span class="value -increase"><span>0.4284</span>
    </span></td></tr></tbody></table>

<tr>
    <td colspan="2" align="center">
        <div>
            <h2>Operations history</h2>
            <table class="table table-stripped">
                <thead>
                <tr>
                    <th>purchase</th>
                    <th>Sum</th>
                    <th>Sale</th>
                    <th>Sum</th>
                    <th>Rate</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="trsnsact" items="${transaction}">
                    <tr>
                        <td><c:out value="${trsnsact.currencyBuy}"/></td>
                        <td><c:out value="${trsnsact.sumBuy}"/></td>
                        <td><c:out value="${trsnsact.currencySale}"/></td>
                        <td><c:out value="${trsnsact.sumSale}"/></td>
                        <td><c:out value="${trsnsact.rate}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </td>
</tr>


</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>