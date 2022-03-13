#!/usr/bin/env bash

CURRENT_DIR=$(dirname "$0")

commit_id=$(git rev-parse --verify --short HEAD)
date=$(git log -1 --format=%cd )

echo "Running git-info.sh script"

cat <<EOF > "${CURRENT_DIR}/src/main/resources/git-info.yml"
version: ${commit_id}
date: ${date}
EOF