#!/usr/bin/env python3

def solve_max_worth():
    """
    Optimized solution using DP for Maya's String Challenge
    Time Complexity: O(N * Budget * N) = O(N^2 * Budget)
    Space Complexity: O(N * Budget)
    """
    try:
        # Read input
        n, m = map(int, input().split())
        strings = input().split()
        costs = list(map(int, input().split()))
        
        # Read contradictory pairs
        contradictory = [[] for _ in range(n)]
        string_to_idx = {s: i for i, s in enumerate(strings)}
        
        for _ in range(m):
            s1, s2 = input().split()
            idx1, idx2 = string_to_idx[s1], string_to_idx[s2]
            contradictory[idx1].append(idx2)
            contradictory[idx2].append(idx1)
        
        budget = int(input())
        
        # Calculate worth of each string
        def calculate_worth(s):
            return sum(ord(c) - ord('a') + 1 for c in s)
        
        worths = [calculate_worth(s) for s in strings]
        
        # DP approach with memoization
        from functools import lru_cache
        
        @lru_cache(maxsize=None)
        def dp(idx, remaining_budget, excluded_set):
            if idx == n or remaining_budget < 0:
                return 0
            
            # Option 1: Skip current string
            result = dp(idx + 1, remaining_budget, excluded_set)
            
            # Option 2: Take current string if not excluded and affordable
            if idx not in excluded_set and costs[idx] <= remaining_budget:
                # Create new excluded set with contradictory strings
                new_excluded = excluded_set | frozenset(contradictory[idx])
                result = max(result, worths[idx] + dp(idx + 1, remaining_budget - costs[idx], new_excluded))
            
            return result
        
        return dp(0, budget, frozenset())
    
    except Exception as e:
        return 0

# Alternative iterative DP solution for better performance
def solve_max_worth_iterative():
    """
    Iterative DP solution with better memory management
    """
    try:
        # Read input
        n, m = map(int, input().split())
        strings = input().split()
        costs = list(map(int, input().split()))
        
        # Read contradictory pairs
        contradictory = [set() for _ in range(n)]
        string_to_idx = {s: i for i, s in enumerate(strings)}
        
        for _ in range(m):
            s1, s2 = input().split()
            idx1, idx2 = string_to_idx[s1], string_to_idx[s2]
            contradictory[idx1].add(idx2)
            contradictory[idx2].add(idx1)
        
        budget = int(input())
        
        # Calculate worth of each string
        def calculate_worth(s):
            return sum(ord(c) - ord('a') + 1 for c in s)
        
        worths = [calculate_worth(s) for s in strings]
        
        # Create items list with (worth, cost, contradictory_set)
        items = [(worths[i], costs[i], contradictory[i]) for i in range(n)]
        
        # Use branch and bound with pruning
        max_worth = 0
        
        def backtrack(idx, current_worth, current_cost, used_set):
            nonlocal max_worth
            
            if current_cost > budget:
                return
            
            max_worth = max(max_worth, current_worth)
            
            if idx >= n:
                return
            
            # Pruning: calculate upper bound
            remaining_budget = budget - current_cost
            upper_bound = current_worth
            for i in range(idx, n):
                if i not in used_set and costs[i] <= remaining_budget:
                    if not contradictory[i] & used_set:  # No conflicts
                        upper_bound += worths[i]
                        remaining_budget -= costs[i]
            
            if upper_bound <= max_worth:
                return
            
            # Try including current item
            if idx not in used_set and costs[idx] <= budget - current_cost:
                if not contradictory[idx] & used_set:  # No conflicts
                    new_used = used_set | {idx} | contradictory[idx]
                    backtrack(idx + 1, current_worth + worths[idx], current_cost + costs[idx], new_used)
            
            # Try not including current item
            backtrack(idx + 1, current_worth, current_cost, used_set)
        
        backtrack(0, 0, 0, set())
        return max_worth
    
    except Exception as e:
        return 0

def main():
    """Main function to run the optimized solution"""
    result = solve_max_worth_iterative()
    print(result)

if __name__ == "__main__":
    main()