#!/usr/bin/env bash
awk '{ for(i=1;i<=NF;i++){ count[$i]++ }   }END{ for(i in count) {print i,count[i]} }' words.txt|sort -k2nr