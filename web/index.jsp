
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>База</title>
    </head>
    <body>
        <form action = "getParam" method = "GET">
           <table>
               <caption>Данные</caption>
               <tr><td>id<input type = "number" name = "x1"
            value = "1" step="1"/></td>
               <td>Продукт\Адрес\Количество<input type = "text" name = "x2"
            value = "3"/></td>
               <td>Цена\.\Стоимость<input type = "number" name = "x3"
            value = "4" step="1"/></td>
               <td>.\.\id магазина <input type = "number" name = "x4"
            value = "4" step="1"/></td>
               <td>.\.\id продукта <input type = "number" name = "x5"
            value = "6" step="1"/></td>
              <td> <select name="table">
                        <option selected>Product</option>
                        <option>Store</option>
                        <option>Tranzaction</option>
              </select> </td>
              <td> <select name="operation">
                        <option selected>insert</option>
                        <option>delete</option>
                        <option>output</option>
              </select> </td>
               </tr>   
               <tr>
                <td><button>Do</button> </td>
               </tr>
           </table>  
        </form>
    </body>
</html>
