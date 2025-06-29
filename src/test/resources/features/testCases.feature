#This will be automated testcases if i would implement
1.	Submit string "abcabcbb"
- Should return 3 as the result.

2.	Submit "bbbbb"
- Should return 1.

3.	Submit empty string
- Should either return 0 or show an error — depends on how the app is built.

4.	Input with spaces like "a b c a"
- Should return 4 (space is counted as a unique character).

5.	Input with special characters "ab!@ab"
- It should handle symbols and return 5.

6.	Input max-length string (e.g., 1000+ characters)
- I want to see if the app handles it without crashing.

7.	Check if it redirects to /qa/result after submit
- After hitting submit, the URL should change to /qa/result.

8.	Verify result displayed matches algorithm output
- I’ll use my LongestString class to compare actual vs expected.

9.	Test updating input after initial result
- When I enter a new string and click submit again, the result should update.

10.	Use browser back button after result
- Hitting back should take me to the input page — it should work cleanly.


# This will be Manual test cases
1.	Check layout and alignment of input field and button
- Just want to make sure they look properly aligned on desktop and mobile.

2.	Check button hover effect
- Hovering over the “Submit” button should show some visual feedback (color change or shadow).

3.	Verify font consistency across pages
- The fonts on both input and result pages should match and look clean.

4.	Responsive design
- I’ll resize the browser and open on mobile to check if the UI adjusts properly.

5.	Result label formatting
- Result should say something like Longest substring length is: 3 —
no weird grammar.

6.	Check favicon and page title
- Want to confirm the page has the right title and favicon (branding stuff).

7.	Keyboard tab order
- I’ll try navigating using just the Tab key to make sure it’s accessible.

8.	Check high contrast mode
- Turning on high contrast in OS should still keep everything readable.

9.	Test keyboard-only interaction
- Can I fully operate the app (input + submit) using only keyboard?

10.	Cross-browser check
- I’ll open the app on Chrome, Firefox, and Safari to confirm it behaves the same.

