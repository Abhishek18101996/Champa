<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <title>HR Leave</title>
        <link rel="stylesheet" href="css/normalize.css">
        <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/main.css">
</head>
<body>
<style>
*, *:before, *:after {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}

body {
  font-family: 'Nunito', sans-serif;
  color: #384047;
}

form {
  max-width: 300px;
  margin: 10px auto;
  padding: 10px 20px;
  background: #f4f7f8;
  border-radius: 8px;
}

h1 {
  margin: 0 0 30px 0;
  text-align: center;
}

input[type="text"],
input[type="password"],
input[type="date"],
input[type="datetime"],
input[type="email"],
input[type="number"],
input[type="search"],
input[type="tel"],
input[type="time"],
input[type="url"],
textarea,
select {
  background: rgba(255,255,255,0.1);
  border: none;
  font-size: 16px;
  height: auto;
  margin: 0;
  outline: 0;
  padding: 15px;
  width: 100%;
  background-color: #e8eeef;
  color: #8a97a0;
  box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
  margin-bottom: 30px;
}

input[type="radio"],
input[type="checkbox"] {
  margin: 0 4px 8px 0;
}

select {
  padding: 6px;
  height: 32px;
  border-radius: 2px;
}

button {
  padding: 19px 39px 18px 39px;
  color: #FFF;
  background-color: #4bc970;
  font-size: 18px;
  text-align: center;
  font-style: normal;
  border-radius: 5px;
  width: 100%;
  border: 1px solid #3ac162;
  border-width: 1px 1px 3px;
  box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;
  margin-bottom: 10px;
}

fieldset {
  margin-bottom: 30px;
  border: none;
}

legend {
  font-size: 1.4em;
  margin-bottom: 10px;
}

label {
  display: block;
  margin-bottom: 8px;
}

label.light {
  font-weight: 300;
  display: inline;
}

.number {
  background-color: #5fcf80;
  color: #fff;
  height: 30px;
  width: 30px;
  display: inline-block;
  font-size: 0.8em;
  margin-right: 4px;
  line-height: 30px;
  text-align: center;
  text-shadow: 0 1px 0 rgba(255,255,255,0.2);
  border-radius: 100%;
}

@media screen and (min-width: 480px) {

  form {
    max-width: 480px;
  }

}
</style>
    <body background="images\form_background_image.jpg" item-width="100">

      <html> 
        <head>
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Leave Application</title>
                <link rel="stylesheet" href="css/normalize.css">
                <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
                <link rel="stylesheet" href="css/main.css">
            </head>
        <style>
        *, *:before, *:after {
          -moz-box-sizing: border-box;
          -webkit-box-sizing: border-box;
          box-sizing: border-box;
        }
        
        body {
          font-family: 'Nunito', sans-serif;
          color: #384047;
        }
        
        form {
          max-width: 300px;
          margin: 10px auto;
          padding: 10px 20px;
          background: #f4f7f8;
          border-radius: 8px;
        }
        
        h1 {
          margin: 0 0 30px 0;
          text-align: center;
        }
        
        input[type="text"],
        input[type="password"],
        input[type="date"],
        input[type="datetime"],
        input[type="email"],
        input[type="number"],
        input[type="search"],
        input[type="tel"],
        input[type="time"],
        input[type="url"],
        textarea,
        select {
          background: rgba(255,255,255,0.1);
          border: none;
          font-size: 16px;
          height: auto;
          margin: 0;
          outline: 0;
          padding: 15px;
          width: 100%;
          background-color: #e8eeef;
          color: #8a97a0;
          box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
          margin-bottom: 30px;
        }
        
        input[type="radio"],
        input[type="checkbox"] {
          margin: 0 4px 8px 0;
        }
        
        select {
          padding: 6px;
          height: 32px;
          border-radius: 2px;
        }
        
        button {
          padding: 19px 39px 18px 39px;
          color: #FFF;
          background-color: #4bc970;
          font-size: 18px;
          text-align: center;
          font-style: normal;
          border-radius: 5px;
          width: 100%;
          border: 1px solid #3ac162;
          border-width: 1px 1px 3px;
          box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;
          margin-bottom: 10px;
        }
        
        fieldset {
          margin-bottom: 30px;
          border: none;
        }
        
        legend {
          font-size: 1.4em;
          margin-bottom: 10px;
        }
        
        label {
          display: block;
          margin-bottom: 8px;
        }
        
        label.light {
          font-weight: 300;
          display: inline;
        }
        
        .number {
          background-color: #5fcf80;
          color: #fff;
          height: 30px;
          width: 30px;
          display: inline-block;
          font-size: 0.8em;
          margin-right: 4px;
          line-height: 30px;
          text-align: center;
          text-shadow: 0 1px 0 rgba(255,255,255,0.2);
          border-radius: 100%;
        }
        
        @media screen and (min-width: 480px) {
        
          form {
            max-width: 480px;
          }
        
        }
        </style>
            <!-- <body background="D:\iconnect APD\web\images\form background image.jpg" item-width="100">
         -->
              <body>
              <form action="ApplyLeaveHR" modelAttribute="Leaves" method="post">
              
                <h1>Welcome</h1>
                
                <fieldset>
                  <legend>Employee Leave Request Form</legend>
        			
						<input type="text" name="employee_id" size="45" class="form-control"
							placeholder="Your PS Number" min="10000000" max="15555555"
							maxlength="8" minlength="8" title="Enter Eight Digit PS Number"
							required>
                  <label><b>Leave Type:</b></label>
                  <input type="radio" id="sl" value=3 name="master_id" ><label for="sl" class="light">Sick Leave</label><br>
                  <input type="radio" id="ml" value=2 name="master_id"><label for="ml" class="light">Paid Leave</label><br>
                  <input type="radio" id="cl" value=4 name="master_id"><label for="cl" class="light">Casual Leave</label><br>
                  <input type="radio" id="el" value=1 name="master_id" checked="checked">
                  <label for="pl" class="light">Earned Leave</label><br><br>
                 
                  <label><b>Leave Requested: </b></label>
                  <label for="date" class="light"  required="required">From</label>
                  <input type="date" name="startdate"/>
                  <label for="date" class="light" required="required">To</label><br>
                  <input type="date" name="enddate"/>
        
        
                </fieldset>
                <button type="submit">Submit</button>
              
                <button type="submit" onclick="goBack()" >Back</button>
        
          </form>
        
</body>
</html>