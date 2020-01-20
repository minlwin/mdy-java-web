<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Parameters</title>
</head>
<body>

	<h1>Request Parameters</h1>
	
	<h3>Get With Link</h3>
	
	<a href="params?name=GET_SERVLET&param=Test Param">Get With Link Test</a>
	
	<hr />
	
	<h3>Get with Form</h3>
	
	<form action="params">
		<table>
			<tr>
				<td>Name</td>
				<td>
					<input type="text" name="name" placeholder="Enter Name" />
				</td>
			</tr>
			<tr>
				<td>Param</td>
				<td>
					<input type="text" name="param" placeholder="Enter Param" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Send" />
				</td>
			</tr>
		</table>
	</form>
	
	<hr />
	
	<h3>Post with Form</h3>
	
	<form action="params" method="post">
		
		<table>
			<tr>
				<td>Text</td>
				<td>
					<input type="text" name="text" />
				</td>
			</tr>
			<tr>
				<td>Number</td>
				<td>
					<input type="number" name="number" />
				</td>
			</tr>
			<tr>
				<td>Date</td>
				<td>
					<input type="date" name="date" />
				</td>
			</tr>
			<tr>
				<td>Radio</td>
				<td>
					
					<label for="rd1">
						<input type="radio" name="radio" id="rd1" value="Radio 1"/> Radio 1
					</label>
					
					<label for="rd2">
						<input type="radio" name="radio" id="rd2" value="Radio 2" /> Radio 2
					</label>

					<label for="rd3">
						<input type="radio" name="radio" id="rd3" value="Radio 3" /> Radio 3
					</label>
					
				</td>
			</tr>
			<tr>
				<td>Check Box</td>
				<td>
					<label for="c1">
						<input type="checkbox" name="checkbox" id="c1" value="Check 1" />
						Check 1
					</label>
					<label for="c2">
						<input type="checkbox" name="checkbox" id="c2" value="Check 2" />
						Check 2
					</label>
					<label for="c3">
						<input type="checkbox" name="checkbox" id="c3" value="Check 3" />
						Check 3
					</label>
				
				</td>
			</tr>
			<tr>
				<td>Single Select</td>
				<td>
					<select name="single">
						<option>Select 1</option>
						<option>Select 2</option>
						<option>Select 3</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Multi</td>
				<td>
					<select name="multi" multiple="multiple">
						<option>Select 1</option>
						<option>Select 2</option>
						<option>Select 3</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Text Area</td>
				<td>
					<textarea name="longText" cols="80" rows="6"></textarea>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Send" />
				</td>
			</tr>
		</table>
	
	</form>

</body>
</html>