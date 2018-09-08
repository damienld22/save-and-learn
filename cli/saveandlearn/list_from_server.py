import requests
import json
import utils

def listBestPractices():
  """List all best practices"""
  response = requests.get(utils.BEST_PRACTICES_URL)
  response.raise_for_status()
  return response.json()['_embedded']['best-practice']