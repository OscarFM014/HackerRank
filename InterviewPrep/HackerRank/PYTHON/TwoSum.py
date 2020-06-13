def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        int [] answer = new int [2];
        Hashtable <Integer, Integer> h = new Hashtable<Integer, Integer>();

        for (int i = 0; i < numeros.length; i++){
            if (h.containsKey(numeros[i])){
                answer[0] = numeros[i];
                answer[1] = h.get(numeros[i]);
            }else{
                h.put(n-numeros[i], numeros[i]);
            }
        }

        for (int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;





