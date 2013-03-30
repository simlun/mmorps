#!/bin/bash
set -e
lein midje :autotest src test checkouts/mmorps/src
