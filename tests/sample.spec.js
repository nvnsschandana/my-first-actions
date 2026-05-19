import {test} from '@playwright/test';
test('test',async({page})=>{
  await page.goto("http://10.77.67.16:83/Common/Login.aspx");
});
