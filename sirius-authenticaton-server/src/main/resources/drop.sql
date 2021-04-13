/* DELETAR TODAS TABELAS E SEQUENCES */
BEGIN
    FOR c IN (SELECT table_name FROM user_tables WHERE table_name LIKE 'TB%' OR table_name LIKE 'TJ%' OR table_name LIKE 'APEX$%' OR table_name LIKE 'DEMO%' OR table_name LIKE 'DEP%' OR table_name LIKE 'EMP%') LOOP
        EXECUTE IMMEDIATE ('DROP TABLE ' || c.table_name || ' CASCADE CONSTRAINTS');
    END LOOP;
    
    FOR s IN (SELECT sequence_name FROM user_sequences WHERE sequence_name LIKE 'SEQ_%' OR sequence_name LIKE 'SQ%' OR sequence_name LIKE 'HIBERNATE%') LOOP
        EXECUTE IMMEDIATE ('DROP SEQUENCE ' || s.sequence_name);
    END LOOP;
END;
/

/* DELETAR TODAS VIEWS */
BEGIN
    FOR c IN (SELECT view_name FROM user_views WHERE view_name LIKE 'VW_%') LOOP
        EXECUTE IMMEDIATE ('DROP VIEW ' || c.view_name);
    END LOOP;
END;
/

/* DELETAR TODAS PROCEDURES */
BEGIN
    FOR DATA IN( SELECT object_name from user_objects where object_type='PROCEDURE')
    LOOP
        EXECUTE IMMEDIATE 'DROP PROCEDURE'||data.object_name;
    END LOOP;
END;
/

/* DELETAR TODAS TRIGGERS */
BEGIN
    FOR i IN (SELECT trigger_name FROM user_triggers)
    LOOP
        EXECUTE IMMEDIATE('DROP TRIGGER ' || user || '.' || i.trigger_name);
    END LOOP;
END;
/