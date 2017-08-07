#!/usr/bin/env bash
#Given a text file file.txt, transpose its content.
#
#You may assume that each row has the same number of columns and each field is separated by the ' ' character.
#
#For example, if file.txt has the following content:
#
#name age
#alice 21
#ryan 30
#Output the following:
#
#name alice ryan
#age 21 30
ncol=`head -n1 tran.txt | wc -w`

for i in `seq 1 $ncol`
do
    echo `cut -d' ' -f$i tran.txt`
done