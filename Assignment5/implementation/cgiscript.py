#!/usr/bin/env python3
import cgi

form = cgi.FieldStorage()
username = form.getvalue('username')

print("Content-type: text/html\n")
print(f"<html><body><h1>Hello, {username}!</h1></body></html>")