#! /bin/bash
flyway -url=jdbc:postgresql://${PGHOST}:${PGPORT}/${PGDATABASE} -user=${PGUSER} -password=${PGPASSWORD} -locations=${MIGRATION_LOCATIONS} -sqlMigrationSuffix=".pgsql" migrate