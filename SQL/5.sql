/* Name and number of tabs of all windows */
SELECT w.NAME AS window_name, COUNT(t.AD_TAB_ID) AS number_of_tabs
FROM AD_WINDOWS w
LEFT JOIN AD_TAB t ON w.AD_WINDOW_ID = t.AD_WINDOWS_ID
GROUP BY w.AD_WINDOW_ID;
