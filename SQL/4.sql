/*List of tab name + field name of all tabs in AD_Window_ID = ‘100’ sorted by tab name and field name */
SELECT AD_TAB.NAME, AD_FIELD.NAME
FROM AD_TAB
JOIN AD_FIELD ON AD_TAB.AD_TAB_ID = AD_FIELD.AD_TAB_ID
WHERE AD_TAB.AD_WINDOWS_ID = '100'
ORDER BY AD_TAB.NAME, AD_FIELD.NAME;
