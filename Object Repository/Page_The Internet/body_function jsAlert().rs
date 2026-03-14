<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_function jsAlert()</name>
   <tag></tag>
   <elementGuidId>d2d32ab8-4a0e-4f1e-83cc-07582c038f23</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value></value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>4c6c5ef6-e9d1-4914-8f52-e19ab06b1bc9</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
      
      
        
      
        
      
        
      
      
    
    
      
      
        
  function jsAlert() {
    alert('I am a JS Alert');
    log('You successfully clicked an alert');
  }

  function jsConfirm() {
    var c = confirm('I am a JS Confirm');
    var result = c === true ? 'Ok' : 'Cancel';
    log('You clicked: ' + result);
  }

  function jsPrompt() {
    var p = prompt('I am a JS prompt');
    log('You entered: ' + p);
  }

  function log(msg) {
    var result = document.getElementById('result');
    result.innerHTML = msg;
  }


  JavaScript Alerts
  Here are some examples of different JavaScript alerts which can be troublesome for automation
  
    Click for JS Alert
    Click for JS Confirm
    Click for JS Prompt
  
  Result:
  


      
    
    
      
        
        Powered by Elemental Selenium
      
    
  

</value>
      <webElementGuid>3d0c3f3b-a291-42cc-a779-8509f30b64a1</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>parent</name>
      <type>Main</type>
      <value>md5.v1-41cf27ff4e64b5ea05eec61321a3e506</value>
      <webElementGuid>9c06162e-5bc1-45b9-9240-8d70f006b1d6</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>0371cfd2-fc01-4954-b4ce-184926d42644</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>f9fa4e43-a57b-410b-894e-a1e8e22a1e20</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
    
      
      
        
      
        
      
        
      
      
    
    
      
      
        
  function jsAlert() {
    alert(&quot; , &quot;'&quot; , &quot;I am a JS Alert&quot; , &quot;'&quot; , &quot;);
    log(&quot; , &quot;'&quot; , &quot;You successfully clicked an alert&quot; , &quot;'&quot; , &quot;);
  }

  function jsConfirm() {
    var c = confirm(&quot; , &quot;'&quot; , &quot;I am a JS Confirm&quot; , &quot;'&quot; , &quot;);
    var result = c === true ? &quot; , &quot;'&quot; , &quot;Ok&quot; , &quot;'&quot; , &quot; : &quot; , &quot;'&quot; , &quot;Cancel&quot; , &quot;'&quot; , &quot;;
    log(&quot; , &quot;'&quot; , &quot;You clicked: &quot; , &quot;'&quot; , &quot; + result);
  }

  function jsPrompt() {
    var p = prompt(&quot; , &quot;'&quot; , &quot;I am a JS prompt&quot; , &quot;'&quot; , &quot;);
    log(&quot; , &quot;'&quot; , &quot;You entered: &quot; , &quot;'&quot; , &quot; + p);
  }

  function log(msg) {
    var result = document.getElementById(&quot; , &quot;'&quot; , &quot;result&quot; , &quot;'&quot; , &quot;);
    result.innerHTML = msg;
  }


  JavaScript Alerts
  Here are some examples of different JavaScript alerts which can be troublesome for automation
  
    Click for JS Alert
    Click for JS Confirm
    Click for JS Prompt
  
  Result:
  


      
    
    
      
        
        Powered by Elemental Selenium
      
    
  

&quot;) or . = concat(&quot;
    
      
      
        
      
        
      
        
      
      
    
    
      
      
        
  function jsAlert() {
    alert(&quot; , &quot;'&quot; , &quot;I am a JS Alert&quot; , &quot;'&quot; , &quot;);
    log(&quot; , &quot;'&quot; , &quot;You successfully clicked an alert&quot; , &quot;'&quot; , &quot;);
  }

  function jsConfirm() {
    var c = confirm(&quot; , &quot;'&quot; , &quot;I am a JS Confirm&quot; , &quot;'&quot; , &quot;);
    var result = c === true ? &quot; , &quot;'&quot; , &quot;Ok&quot; , &quot;'&quot; , &quot; : &quot; , &quot;'&quot; , &quot;Cancel&quot; , &quot;'&quot; , &quot;;
    log(&quot; , &quot;'&quot; , &quot;You clicked: &quot; , &quot;'&quot; , &quot; + result);
  }

  function jsPrompt() {
    var p = prompt(&quot; , &quot;'&quot; , &quot;I am a JS prompt&quot; , &quot;'&quot; , &quot;);
    log(&quot; , &quot;'&quot; , &quot;You entered: &quot; , &quot;'&quot; , &quot; + p);
  }

  function log(msg) {
    var result = document.getElementById(&quot; , &quot;'&quot; , &quot;result&quot; , &quot;'&quot; , &quot;);
    result.innerHTML = msg;
  }


  JavaScript Alerts
  Here are some examples of different JavaScript alerts which can be troublesome for automation
  
    Click for JS Alert
    Click for JS Confirm
    Click for JS Prompt
  
  Result:
  


      
    
    
      
        
        Powered by Elemental Selenium
      
    
  

&quot;))]</value>
      <webElementGuid>bbdb388f-21c1-4c03-83b1-d64bc36a7cb5</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
