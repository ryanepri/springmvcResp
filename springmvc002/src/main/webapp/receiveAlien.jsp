<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<body>
<h2>receiveDate</h2>
</body>

receiveAlien datetime hobby[] ListPet
<form action="alien/getArgs" method="get">

    <br>
    datetime<br>
    外星人读取到了mvc配置文件的转换器、于是它大胆的预告了末日。<br>
    <input type="text" name="datetime"><br>


    <br>
    hobby<br>
    外星人掌握了数组科技、上传了个数组以记录自己的爱好。<br>
    <input type="checkbox" name="hobby" value="h1">火星屠杀<br>
    <input type="checkbox" name="hobby" value="h2">地球拾荒<br>
    <input type="checkbox" name="hobby" value="h3">天王星漫游<br>
    <input type="checkbox" name="hobby" value="h4">海王星折射<br>


    <br>
    pet<br>
    外星人也感性化的上传了自己的宠物的信息，但他的宠物不止一个、所以它使用了多个属性中含有List属性的对象进行了上传。<br>
    宠物名:<input type="text" name="pets[0].petName">
    宠物类型:<input type="text" name="pets[0].petType">
    <br>
    宠物名:<input type="text" name="pets[1].petName">
    宠物类型:<input type="text" name="pets[1].petType">
    <br>


    外星人也感性化的上传了自己的宠物……所以它使用了多个属性中含有Map属性的对象进行了上传。<br>
    宠物名:<input type="text" name="petMap[0].petName">
    宠物类型:<input type="text" name="petMap[0].petType">
    <br>
    宠物名:<input type="text" name="petMap[1].petName">
    宠物类型:<input type="text" name="petMap[1].petType">
    <br>

    <input type="submit" value="提交">
</form>


<br>
<br>
<br>

闲暇之余、外星人进行了拙劣的表达、上传了一段不明含义的暗码。
<form action="alien/getDC" method="get">

    darkCode<br>
    它在尝试与我们交流吗？还是只是一段无意义的自言自语？<br>
    dcName:<input type="text" name="dc.dcName">
    dcType:<input type="text" name="dc.dcType">
    <input type="submit" value="提交">
</form>

</html>
