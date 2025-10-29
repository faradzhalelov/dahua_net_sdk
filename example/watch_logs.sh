#!/bin/bash
log stream --predicate 'processImagePath CONTAINS "Runner"' --style compact --color none 2>&1 | grep --line-buffered "DahuaBridge\|flutter:"
