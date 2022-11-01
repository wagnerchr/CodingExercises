
let str1 = "acbedgfhikj";
let str2 = "abcdefghijk";

if(isAnagram(str1, str2)) 
    console.log("Sim! \"" + str1 + "\" é um anagrama de \"" + str2 + "\"");
else
    console.log("Não... \"" + str1 + "\" não é um anagrama de \"" + str2 + "\"");

function isAnagram(str1, str2) {
    if(str1.length != str2.length) 
        return false
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    
    let freq1 = [];
    let freq2 = [];

    for(s in str1) 
       freq1[s] = str1[s];
    for(s in str2)
        freq2[s] = str2[s];

    freq1 = freq1.sort();
    freq2 = freq2.sort();

    for(i in freq1) {
        if(freq1[i] != freq2[i])
            return false;
    }

    return true;
}
