#!/usr/bin/env bash
#Given a text file file.txt that contains list of phone numbers (one per line), write a one liner bash script to print all valid phone numbers.
#
#You may assume that a valid phone number must appear in one of the following two formats: (xxx) xxx-xxxx or xxx-xxx-xxxx. (x means a digit)
#
#You may also assume each line in the text file must not contain leading or trailing white spaces.
#
#For example, assume that file.txt has the following content:
##linux
grep -P '^((\d{3}-|\(\d{3}\) )\d{3}-\d{4})$'  validate.txt

##mac
#grep -E '^((\d{3}-|\(\d{3}\) )\d{3}-\d{4})$'  validate.txt