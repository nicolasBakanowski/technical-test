/* Windows with more than 5 tabs */
SELECT AD_WINDOWS.NAME, COUNT(AD_TAB.AD_TAB_ID) AS NUMBER_OF_TABS
FROM AD_WINDOWS
LEFT JOIN AD_TAB ON AD_WINDOWS.AD_WINDOWS_ID = AD_TAB.AD_WINDOWS_ID
GROUP BY AD_WINDOWS.NAME
HAVING COUNT(AD_TAB.AD_TAB_ID) > 5;