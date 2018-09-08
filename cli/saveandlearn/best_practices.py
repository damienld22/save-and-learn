import requests
import json
import utils

class BestPractice():
  """Define a best practice with  :
  - a title
  - a optional content
  """

  def __init__(self, title, content):
    """Constructor of best practice"""
    self.title = title
    self.content = content if content else "No content"

  def save(self):
    """Save a best practice of the server"""
    response = requests.post(utils.BEST_PRACTICES_URL, data=json.dumps(self.__dict__))
    return response.raise_for_status()
