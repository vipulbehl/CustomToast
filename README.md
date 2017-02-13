# CustomToast
This is a very simple toast library. You can customize your toast messages using this library.

<h2><b>EXAMPLES</b></h2>
<img src="https://github.com/vipulbehl/CustomToast/blob/master/demo.gif" height="533" width="300">

<h2><b>INSTALLATION</b></h2>
To start using this library add the following line in the dependecy section of your (Module:app) gradle file.<br>
<code>compile 'com.github.vipul:customtoastlibrary:1.0'</code><br><br>

<h2><b>USAGE</b></h2>
Using this library is very simple, just create an object of CustomToast class and pass Application's context and toast message as parameters.<br>
<code>CustomToast customToast = new CustomToast(getApplicationContext(),"Hello World");</code><br>
<code>customToast.showToast();</code>

The showToast method displays the toast message in the android app. Now to customize your toast you can call various methods on
CustomToast's object that you just created. Following is the description of some of the methods available in the library.<br>

<ol>
<li><code>void setTextSize(float size)</code> - Changes the toast's text size</li>
<li><code>void setTextColor(int color)</code> - Changes the toast's text color. Eg. Pass COLOR.RED as argument to this function to change text color to red.</li>
<li><code>void setBold(float size)</code> - Makes the toast content appear in bold.</li>
<li><code>void setItalics(float size)</code> - Makes the toast content appear in italics.</li>
<li><code>void setBackgroundColor(int color)</code> - Pass a color int value to set the background color, such as COLOR.rgb().</li>
<li><code>void setToastIcon(int image)</code> - Takes a drawable as argument and displays the drawable image in the toast.</li>
<li><code>void setDuration(String duration)</code> - Change toast's duration by passing a string "long" or "short".</li>
</ol>
