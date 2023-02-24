/* List of all windows with its number of fields, sorting by number of fields starting
by the windows with a higher number of them */

SELECT AD_WINDOWS.NAME, COUNT(AD_FIELD.AD_FIELD_ID) AS NUMBER_OF_FIELDS
FROM AD_WINDOWS
LEFT JOIN AD_TAB ON AD_WINDOWS.AD_WINDOWS_ID = AD_TAB.AD_WINDOWS_ID
LEFT JOIN AD_FIELD ON AD_TAB.AD_TAB_ID = AD_FIELD.AD_TAB_ID
GROUP BY AD_WINDOWS.NAME
ORDER BY NUMBER_OF_FIELDS DESC;