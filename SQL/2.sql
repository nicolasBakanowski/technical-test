/* Update window with AD_Window_ID = ‘100’ appending ‘--’ to the name of window with AD_Window_ID = ‘100’*/
UPDATE AD_WINDOWS SET name = CONCAT(name, '--') WHERE AD_WINDOWS_ID = 100;
