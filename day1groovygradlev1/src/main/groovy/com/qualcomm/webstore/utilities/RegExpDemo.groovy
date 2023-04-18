package com.qualcomm.webstore.utilities

import java.util.regex.Pattern

//find operator
assert "We have chosen web store project" =~ /web/


assert "Product having Product Id 1234 found in records " =~ /.*\d{4,8}.*/

def pattern= ~/.*\d{4,8}.*/

assert pattern instanceof Pattern

def info="Product having Product Id 1234 found in records"

assert info =~ pattern

def namePattern= ~/[a-zA-Z]{5,25}/
def firstName="Parameswari"
assert firstName =~ namePattern

//matcher operator
def matches = namePattern.matcher(firstName)

assert matches.matches()